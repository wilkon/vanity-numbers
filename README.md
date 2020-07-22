# Vanity Numbers
### Small app to generate possible vanity numbers
### Scaffolding provided by [Spring Initializer](https://start.spring.io/) and [Angular CLI](https://cli.angular.io/)

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

### Project Setup
* Spring Boot: Intellij - open `build.gradle` as new project
* Angular: Any text editor is okay, but I used [Visual Code](https://code.visualstudio.com/).

## Spring Boot App 
* CORS configured to take requests from port 4200 (Angular default)
### **Ready to run the Spring Boot Wizardry?**
Choose one of two methods to run
### Method 1 - 
from the project root directory - run 

```./gradlew build```

then 

```java -jar build/lib/snapshotcreated.jar``` 

your path to the jar may differ

### Method 2 - 
from the project root directory - run 

```./gradlew bootRun```

## Angular Web App
### **Ready for the Angular Gymnastics performance?**
from the project root directory - run

```ng serve --open```

A browser redirecting to Angular should also open for you with this.

Known Issues:
Although API can read * and # symbols, params not implemented from the HttpClient calls.

**Note**:
I had a lot of fun learning about Angular and Spring Boot - much more so than I expected. The tutorials and resources in general for both technologies are vast, so it will be complicated to find one that is still relevant or suiting. Starting at the documentation websites and including version numbers at hand during searches will be key if learning.
