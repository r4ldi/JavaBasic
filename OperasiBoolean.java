public class OperasiBoolean {
    public static void main(String[] args) {

        var absen = 70;
        var hadir = 80;

        boolean lulusAbsen = absen >= 75;
        var lulusHadir = hadir >= 80;

        var lulus = lulusAbsen && lulusHadir;
        System.out.println(lulus);
    }
}
