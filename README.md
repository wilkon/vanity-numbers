# Vanity Numbers
### Small app to generate possible vanity numbers
### Scaffolding provided by Spring Initializer and Angular CLI

## Specifications I used 
* java 1.8+
* node 12.8.2
* npm 6.14.2

**Angular** stuffs
* angular-devkit/architect    0.1000.3    
* angular-devkit/core         10.0.3
* angular-devkit/schematics   10.0.3
* schematics/angular          10.0.3
* schematics/update           0.1000.3
* rxjs                         6.5.5

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

**Note**:
I had a lot of fun learning about Angular and Spring Boot - much more so than I expected. The tutorials and resources in general for both technologies are vast, so it will be complicated to find one that is still relevant or suiting. Starting at the documentation websites and including version numbers at hand during searches will be key if learning.
