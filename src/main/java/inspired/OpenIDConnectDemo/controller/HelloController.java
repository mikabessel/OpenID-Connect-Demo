package inspired.OpenIDConnectDemo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index(@AuthenticationPrincipal OidcUser user) {
        return "Welcome, " + user.getFullName();
    }

    @GetMapping("/restricted")
    public String restricted() {
        return "To see this text you need to be logged in";
    }
}
