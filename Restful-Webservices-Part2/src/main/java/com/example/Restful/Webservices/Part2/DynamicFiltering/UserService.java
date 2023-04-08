package com.example.Restful.Webservices.Part2.DynamicFiltering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service

public class UserService {



        private static List<User> userList=new ArrayList<>();
        private static int idCount=0;
        static {

            userList.add(new User("Himani",20,++idCount,"himani@"));
            userList.add(new User("Shreya",21,++idCount,"Shreya@"));
            userList.add(new User("Riya",21,++idCount,"Riya@"));
            userList.add(new User("Harsh",23,++idCount,"Harsh@"));
        }

        public MappingJacksonValue addNewUser(User user)
        {
            user.setUserId(++idCount);
            List<MappingJacksonValue> userList1=new ArrayList<>();

            MappingJacksonValue mapping=new MappingJacksonValue(user);
            SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("name","userId","age");
            FilterProvider filters=new SimpleFilterProvider().addFilter("newUser",filter);
            mapping.setFilters(filters);

            userList1.add(mapping);


            return mapping;
        }

        public List<User> getAllUser()
        {
           return userList;
        }

        public User getUserById(int id)
        {

            return userList.stream().filter(e -> e.getUserId()==id).findFirst().orElse(null);
        }


        public void updateUser(User user,int id)
        {
            userList= userList.stream().map(emp->{
                if (emp.getUserId()==id)
                {
                    emp.setName(user.getName());
                    emp.setAge(user.getAge());
                    emp.setPassword(user.getPassword());
                }
                return emp;
            }).collect(Collectors.toList());


        }

        public void removeUserById(int id)
        {
            userList= userList.stream().filter(emp-> emp.getUserId()!=id).collect(Collectors.toList());

        }


    }


