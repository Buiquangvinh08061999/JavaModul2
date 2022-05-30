package _20_thi_thuchanh.services;

import _20_thi_thuchanh.utils.CSVUtils;
import _20_thi_thuchanh.model.ManagePhoneList;

import java.util.*;

public class DirectoryService implements IDirectoryService{

    public final static  String path ="_20_thi_thuchanh/contacts.csv";
    List<ManagePhoneList> directorieList = new ArrayList<>();




    @Override
    public List<ManagePhoneList> findAll() {
        List<ManagePhoneList> newMPList = new ArrayList<>();

        List<String> records = CSVUtils.readFile(path);
        for (String record : records){
            newMPList.add(new ManagePhoneList(record));
        }
    return newMPList;
    }

    @Override
    public void add(ManagePhoneList newMPList) {
        directorieList.add(newMPList);
        CSVUtils.writeFile(path, directorieList);
    }

    @Override
    public void update() {
            CSVUtils.writeFile(path, directorieList);
    }

    @Override
    public void remove(DirectoryService directoryService) {
        directorieList.remove(directoryService);
        update();
    }



    @Override
    public ManagePhoneList searchName(String name) {
        for (ManagePhoneList newMPList : directorieList){
            if(newMPList.getName().contains(name)){
                return newMPList;
            }
        }
        return null;
    }

    @Override
    public boolean existByName(String name) {
        return searchName(name) !=null;
    }

    @Override
    public List<ManagePhoneList> searchProductByName(String name) {
        List<ManagePhoneList> searchList = new ArrayList<>();
        for (ManagePhoneList newMPList : directorieList){
            if(newMPList.getName().contains(name)){
                searchList.add(newMPList);
            }
        }
        return searchList;
    }



}
