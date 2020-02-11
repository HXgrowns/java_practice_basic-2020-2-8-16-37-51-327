public class Application {
    public static void main(String[] args) {
        SoftWare intellijIdea = new IntellijIdea();
        intellijIdea.pressF5();
        SoftWare chrome = new Chrome();
        chrome.pressF5();
        SoftWare wechat = new Wechat();
        wechat.pressF5();
    }
}
