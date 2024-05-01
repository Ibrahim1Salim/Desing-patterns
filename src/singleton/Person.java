package singleton;
public  class Person {
    private String name;
    private String surname;

    private static Person instance;
    private Person(String name,String surname){
        this.name=name;
        this.surname=surname;
    }

    public static Person getInstance(){
        if(instance==null){
            instance=new Person("name","surname");
        }

        return instance;
    }



}

