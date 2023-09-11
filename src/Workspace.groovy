

import java.nio.file.Files
import java.nio.file.Paths

abstract class Workspace {

    abstract String buildTool();

    void init(String workspaceDir) {
        var dir = Paths.get(workspaceDir) //path to the directory
        Files.walk(dir) // Traverse the file tree in depth-first order
            .sorted(Comparator.reverseOrder())
            .forEach(path -> {
                try {
                    System.out.println("Deleting: " + path)
                    Files.delete(path)  //delete each file or directory
                } catch (IOException e) {
                    e.printStackTrace()
                }
            })
    }

    abstract void cloneRepo();

    abstract void build();

    abstract void test();

    abstract void bundle();

    abstract void clean();
}