// src/pages/EmployeePage.js
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function EmployeePage() {
    const [employees, setEmployees] = useState([]);
    const [employee, setEmployee] = useState({ name: '', designation: '', ctc: '', email: '' });

    useEffect(() => {
        fetchEmployees();
    }, []);

    const fetchEmployees = async () => {
        const response = await axios.get('/employees');
        setEmployees(response.data);
    };

    const handleChange = (e) => {
        const { name, value } = e.target;
        setEmployee(prevState => ({ ...prevState, [name]: value }));
    };

    const addEmployee = async () => {
        await axios.post('/employees', employee);
        fetchEmployees();
        setEmployee({ name: '', designation: '', ctc: '', email: '' });
    };

    return (
        <div>
            <h2>Employees</h2>
            <form onSubmit={(e) => { e.preventDefault(); addEmployee(); }}>
                <input type="text" name="name" value={employee.name} onChange={handleChange} placeholder="Name" required />
                <input type="text" name="designation" value={employee.designation} onChange={handleChange} placeholder="Designation" required />
                <input type="number" name="ctc" value={employee.ctc} onChange={handleChange} placeholder="CTC" required />
                <input type="email" name="email" value={employee.email} onChange={handleChange} placeholder="Email" required />
                <button type="submit">Add Employee</button>
            </form>
            <ul>
                {employees.map(emp => (
                    <li key={emp.email}>{emp.name} - {emp.designation} - {emp.ctc} - {emp.email}</li>
                ))}
            </ul>
        </div>
    );
}

export default EmployeePage;
