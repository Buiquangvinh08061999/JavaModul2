package LearnJaVa.ArrayBasic.PhuongThucVoiMethod;

public class KhongcoKDLtrave {
    public static void main(String[] args) {
        System.out.println("Số tương ứng là: " + diemTrungBinh(78.5));
        System.out.println("Số tương ứng là: " + diemTrungBinh(59.5));
    }

    public static String diemTrungBinh(double score) {
            if (score >= 90.0) {
                return "XS";
            } else if (score >= 80.0) {
                return "Giỏi";
            } else if (score >= 70.0) {
                return "Khá";
            } else if (score >= 60.0) {
                return "Trung Bình";
            } else {
                return "Yếu";
            }
        }
    }

