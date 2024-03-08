package net.Spring.springboot.service.impl;

import lombok.AllArgsConstructor;
import net.Spring.springboot.entity.User;
import net.Spring.springboot.repository.UserRepository;
import net.Spring.springboot.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }


    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getId()).get();


        //// CADASTRO ////

        // Dados Pessoais

        existingUser.setNomecompleto(user.getNomecompleto());

        existingUser.setCpf(user.getCpf());

        existingUser.setRg(user.getRg());

        existingUser.setDatadenascimento(user.getDatadenascimento());

        existingUser.setSexo(user.getSexo());

        // Endereco

        existingUser.setCep(user.getCep());

        existingUser.setEndereco(user.getEndereco());

        existingUser.setNumero(user.getNumero());

        existingUser.setBairro(user.getBairro());

        existingUser.setCidade(user.getCidade());

        existingUser.setEstado(user.getEstado());

        //Online

        existingUser.setEmail(user.getEmail());

        existingUser.setSenha(user.getSenha());

        //Telefone

        existingUser.setCelular(user.getCelular());

        return userRepository.save(existingUser);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
