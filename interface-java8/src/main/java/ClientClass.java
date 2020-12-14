public class ClientClass extends ParentClass implements FirstInterface, SecondInterface{

    public static void main(String[] args) {

        ClientClass clientClass = new ClientClass();

        clientClass.show();

        FirstInterface.show_static();

    }
}
