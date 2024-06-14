import DAO.userDAO;
import entity.user;

public class App {
    public static void main(String[] args) throws Exception {
        user u = new user();
        u.setNome("Luis");
        u.setEmail("luis.gustavo.sene99@gmail.com");
        u.setLogin("LuisinhoDiadema");
        u.getPassword("1234");

        new userDAO().registerUser(u);
    }
}
