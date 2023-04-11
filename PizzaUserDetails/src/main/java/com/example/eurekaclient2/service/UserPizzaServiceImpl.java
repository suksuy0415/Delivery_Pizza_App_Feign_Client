package com.example.eurekaclient2.service;


import com.example.eurekaclient2.domain.User;
import com.example.eurekaclient2.exception.UserAlreadyExistsException;
import com.example.eurekaclient2.proxy.UserProxy;
import com.example.eurekaclient2.repository.UserPizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPizzaServiceImpl implements UserPizzaService {
    private UserPizzaRepository userPizzaRepository;
    private UserProxy userProxy;
    @Autowired
    public UserPizzaServiceImpl(UserPizzaRepository userPizzaRepository, UserProxy userProxy) {
        this.userPizzaRepository = userPizzaRepository;
        this.userProxy = userProxy;
    }

    @Override
    public User registerUser(User user){


        User savedUser = userPizzaRepository.save(user);  // Database 1

           userProxy.saveUser(user);   // Database 2

        return savedUser;

    }

 //   @Override
//    public User saveUserPizzaToList(Pizza pizza, String email) throws UserNotFoundException {
//        if(userPizzaRepository.findById(email).isEmpty())
//        {
//            throw new UserNotFoundException();
//        }
//        User user = userPizzaRepository.findByEmail(email);
//        if(user.getPizzaType() == null)
//        {
//            System.out.println("In repo " + email);
//            user.setPizzaType(Arrays.asList(pizza));
//        }
//        else {
//            List<Pizza> pizzas = user.getPizzaType();
//            pizzas.add(pizza);
//            user.setPizzaType(pizzas);
//        }
//        return userPizzaRepository.save(user);
//    }
//

}
