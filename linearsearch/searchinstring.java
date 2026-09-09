public class searchinstring {

    public static void main(String[] args) {
        String name = "GayatriNawale";
        char target = 'G';

        int idx = searchinstring(name, target);
        if (idx != -1) {
            System.out.println(target + " found at index " + idx);
        } else {
            System.out.println("Character not found");
        }

    }

    static int searchinstring(String name, char target) {
        int idx = -1;
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)) {
                idx = i;
                break;
            }
        }
        return idx;
    }

}
