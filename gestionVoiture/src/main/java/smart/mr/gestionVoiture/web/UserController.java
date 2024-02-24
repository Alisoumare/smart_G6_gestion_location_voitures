package smart.mr.gestionVoiture.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import smart.mr.gestionVoiture.repository.UserRepository;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;


}

