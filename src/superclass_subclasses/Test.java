package superclass_subclasses;

public class Test {

    public static void main(String[] args) {

        Dog poodle = new Poodle();
        String poodleSound = poodle.getBark();

        Dog retriever = new Retriever();
        String retrieverSound = retriever.getBark();

        String msg = "The poodle says " + poodleSound +
                        " and the retriever says " + retrieverSound
                        + ".";
        System.out.println(msg);

    }

}
