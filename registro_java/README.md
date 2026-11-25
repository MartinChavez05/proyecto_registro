# registro_java

Generated from the class Servlet 3+ / JSP archetype. Jakarta Servlet 6.0, targets Tomcat 10.1+.


```
./mvnw clean package
```

(Windows: `mvnw.cmd clean package`.) No local Maven install needed — the wrapper
downloads the pinned Maven version the first time you run it. This produces
`target/registro_java.war`.


**Option A — copy the WAR:**
Copy `target/registro_java.war` into `$CATALINA_HOME/webapps/`, then (re)start Tomcat.
Visit: `http://localhost:8080/registro_java/`

**Option B — Tomcat Manager:**
Open `http://localhost:8080/manager/html`, use "WAR file to deploy" to upload
`target/registro_java.war`.

**Option C — VS Code:**
Install the "Community Server Connectors" extension (Red Hat), add your local Tomcat
as a server, then drag the generated WAR onto it — or right-click the server and
"Add Deployment".


```
mvnw / mvnw.cmd                        -> Maven Wrapper, run instead of mvn
.mvn/wrapper/maven-wrapper.properties  -> pinned Maven version it downloads
src/main/java/...HelloServlet.java     -> example @WebServlet, no web.xml mapping needed
src/main/webapp/index.jsp              -> public landing page
src/main/webapp/WEB-INF/views/hello.jsp-> only reachable via servlet forward
src/main/webapp/WEB-INF/web.xml        -> welcome-file + session-config only
src/main/webapp/css/style.css
```
