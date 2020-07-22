# Vanity Numbers
### Small app to generate possible vanity numbers
### Implemented projects using the scaffolding provided by Spring Initializer and Angular CLI

## SpringBoot App - CORS configured to take request from 4200 (angular default)
### Method 1 - 
run ```./gradlew build``` command 
then ```java -jar snapshotcreated.jar ```

### Method 2 - 
```./gradlew bootRun```

## Angular Web App
```ng serve --open```

Known Issues:
Although API can read * and # symbols, params not implemented from the HttpClient calls.
