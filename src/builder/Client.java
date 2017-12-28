package builder;

/**
 * @author Noblel
 * 建造者模式
 */
class Client {
    public static void main(String[] args) {

        User user = new User.UserBuilder("Noble", "l")
                .age(20)
                .address("HN")
                .phone("110")
                .build();
        System.out.println(user.getLastName());
    }
}
