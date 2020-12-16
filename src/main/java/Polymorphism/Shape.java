package Polymorphism;

abstract class Shape implements Paper{
    private String type;

    abstract void drawing();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void newPaper() {
        System.out.println("New list of a paper is ready");
    }

    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                '}';
    }
}
