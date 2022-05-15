package com.example.opd_two.service;

import com.example.opd_two.model.Student;
import com.example.opd_two.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class StudentService {
    private final StudentRepository repository;

    public Student getById(Long id) {
        return repository.getById(id);
    }

    public List<Student> getAll() {
        return repository.findAll();
    }

    public Student add(Student student) {
        if (isExist(student.getId())) {
            return null;
        } else {
            return repository.save(student);
        }
    }

    public Student update(Student student) {
        if (isExist(student.getId())) {
            return repository.save(student);
        } else {
            return null;
        }
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public boolean isExist(Long id) {
        return repository.existsById(id);
    }
}
