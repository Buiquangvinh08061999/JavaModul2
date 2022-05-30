package _20_thi_thuchanh.services;

import _12_java_collection_framework.cdgym.vinhbui.model.Product;
import _20_thi_thuchanh.model.ManagePhoneList;

import java.util.List;

public interface IDirectoryService {
    List<ManagePhoneList> findAll();

    void add(ManagePhoneList newMPL);

    void update();

    void remove(DirectoryService directoryService);

    ManagePhoneList searchName(String name);

    boolean existByName(String name);

    List<ManagePhoneList> searchProductByName(String name);






}
