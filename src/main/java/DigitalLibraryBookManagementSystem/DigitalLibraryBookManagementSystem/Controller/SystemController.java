package DigitalLibraryBookManagementSystem.DigitalLibraryBookManagementSystem.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class SystemController {

    @GetMapping("/exitSystem")
    public void exitSystem() {
        System.exit(0); // Shut down the application
    }
}
