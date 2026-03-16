FROM openjdk:17
COPY . .
RUN javac App.java
CMD ["java","App"]