public class Main {

    public static void main(String[] args) {
        PasswordStore pass1 = new PasswordStore("Akun BCA", "dinarC4ndy", "18271628*&adDeh");
        pass1.setCategory(PasswordStore.CAT_WEBAPP);

        System.out.println(pass1);
    }

}
