class Config2 {
    static String appName;
    static int version;


    static {
        appName = "DemoApp";
        version = 2;
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println(appName + " v" + version);
    }


}
