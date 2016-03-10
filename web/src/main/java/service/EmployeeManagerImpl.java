package service;

import java.util.List;

import dao.EmployeeDAO;
import model.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	EmployeeDAO dao;
	
	public List<EmployeeVO> getAllEmployees()
	{
		return dao.getAllEmployees();
	}
}
