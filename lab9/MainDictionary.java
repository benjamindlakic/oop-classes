package lab9;

public class MainDictionary {
    public static void main(String[] args) {
        MultipleEntryDictionary dict= new PersonalMultipleEntryDictionary();
        dict.add("kusi", "six");
        dict.add("kusi", "spruce");

        dict.add("pii", "pi");
        dict.add("pii", "silicone");

        System.out.println(dict.translate("kusi"));
        dict.remove("pii");
        System.out.println(dict.translate("pii"));
    }
}
