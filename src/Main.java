public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        config.setServerUrl("http://miapi.com");
        System.out.println("URL del Servidor: " + config.getServerUrl());

        // TODO: Utiliza más propiedades de la configuración aquí

        config.setPort(3306);
        System.out.println("Puerto: " + config.getPort());
    }
}