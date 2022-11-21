public class Main {
    public static void main(String[] args) {
        String lvTopicEng = "The main improvement for developers in the new release is the graduation of the standalone " +
                "APIs introduced in preview in the previous release. These are now part of the stable API surface and " +
                "the developers say they will be evolved gradually following semantic versioning. The standalone " +
                "components work across Angular, and they now fully work in HttpClient, Angular Elements, and router. " +
                "The APIs allow you to bootstrap an application using a single component, and there are APIs for " +
                "Router, HttpClient tree-shakable, and Directive composition.";

        String[] ltTextWithSpace = lvTopicEng.split("[^a-zA-Z]");
        for (String lvStr : ltTextWithSpace) {
            System.out.println(lvStr);
        }
    }
}
