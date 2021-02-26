package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

class UserJPAResourceTest {

    private UserRepository userRepository;
    private PostRepository postRepository;
    private UserJPAResource userJPAResource;

    @BeforeEach
    void setUp() {
        postRepository = mock(PostRepository.class);
        userRepository = mock(UserRepository.class);
        userJPAResource = new UserJPAResource(userRepository, postRepository);
    }

    @Test
    void deleteUser() {
        User amber = new User(1, "Amber", new Date());
        when(userRepository.findById(1)).thenReturn(Optional.of(amber));



        ResponseEntity responseEntity = userJPAResource.deleteUser(1);
        verify(userRepository, times(1)).deleteById(1);

        assertEquals(HttpStatus.NO_CONTENT, responseEntity.getStatusCode());

    }
}