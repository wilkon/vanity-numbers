# Vanity Numbers
### Small app to generate possible vanity numbers
### Scaffolding provided by Spring Initializer and Angular CLI

## Spring Boot App - CORS configured to take requests from port 4200 (Angular default)
### Setup
Intellij - open build.gradle as new project

### Method 1 - 
run ```./gradlew build``` command 
then ```java -jar snapshotcreated.jar ```

### Method 2 - 
```./gradlew bootRun```

## Angular Web App
```ng serve --open```

Known Issues:
Although API can read * and # symbols, params not implemented from the HttpClient calls.
