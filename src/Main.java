public class Main {
    public static void main(String[] args) {
        System.out.println(main(33, 22));
        System.out.println(main(27, 24));
        System.out.println(main(20, 33));
        System.out.println(main(25, 22));
        System.out.println(main(45, 28));
        System.out.println(main(42, 34));
    }
    public static String main(int age, int temperature){

        if (age > 20 && age < 45 && temperature >- 20 && temperature > 30){
            return "Можно идти гулять";
        } else if (age < 20 && temperature < 0 && temperature > 28){
            return "Можно идти гулять";
        } else if (age > 45 && temperature <-10 && temperature > 25){
            return "Можно идти гулять";
        } else{
            return "Оставайтесь дома!";
        }
    }
    public static int generateRandomAge(){

    }
}