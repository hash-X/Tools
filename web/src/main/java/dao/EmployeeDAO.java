package dao;

import model.EmployeeVO;

import java.util.List;


public interface EmployeeDAO 
{
	public List<EmployeeVO> getAllEmployees();
}