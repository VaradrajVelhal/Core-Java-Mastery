// Write a Java program to monitor changes to a directory using 
//WatchService. Detect and respond to file creation, modification, and 
//deletion events in the specified directory

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchService;
import java.nio.file.FileSystems;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchEvent;

class program10 {
    public static void main(String[] args) throws Exception {

        Path dir = Paths.get("watchdir");
        WatchService watchService = FileSystems.getDefault().newWatchService();

        dir.register(watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_MODIFY,
                StandardWatchEventKinds.ENTRY_DELETE);

        System.out.println("Watching directory...");

        while (true) {
            WatchKey key = watchService.take();

            for (WatchEvent<?> event : key.pollEvents()) {
                System.out.println("Event: " + event.kind() +
                        " File: " + event.context());
            }
            key.reset();
        }
    }
}
