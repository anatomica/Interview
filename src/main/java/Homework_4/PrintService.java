package Homework_4;

public class PrintService {
    enum printSchemas {
        schema1, schema2, schema3, schema4
    }

    private final RequestManager requestManager;

    public PrintService() {
        this.requestManager =  new RequestManager();
    }

    public void print(printSchemas printSchema) {
        if(printSchema.equals(printSchemas.schema2)) {
            System.out.println("-> " + printSchemas.schema2.name());
            System.out.println(requestManager.getSchema1());
        }
        if(printSchema.equals(printSchemas.schema3)) {
            System.out.println("-> " + printSchemas.schema3.name());
            System.out.println(requestManager.getSchema3());
        }
        if(printSchema.equals(printSchemas.schema4)) {
            System.out.println("-> " + printSchemas.schema4.name());
            System.out.println(requestManager.getSchema4());
        }
    }
}
