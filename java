public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}


FROM eclipse-temurin:17
WORKDIR /app
COPY . .
RUN javac HelloWorld.java
CMD ["java","HelloWorld"]
