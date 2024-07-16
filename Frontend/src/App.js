// src/App.js
import React from 'react';
import { BrowserRouter as Router, Route, Routes, Link } from 'react-router-dom';
import EmployeePage from './pages/EmployeePage';
import VendorPage from './pages/VendorPage';
import SentEmailsPage from './pages/SentEmailsPage';
import './styles.css';

function App() {
    return (
        <Router>
            <div>
                <nav>
                    <ul>
                        <li><Link to="/">Home</Link></li>
                        <li><Link to="/employees">Employees</Link></li>
                        <li><Link to="/vendors">Vendors</Link></li>
                        <li><Link to="/sent-emails">Sent Emails</Link></li>
                    </ul>
                </nav>
                <div className="container">
                    <Routes>
                        <Route path="/" exact element={<HomePage/>} />
                        <Route path="/employees" element={<EmployeePage/>} />
                        <Route path="/vendors" element={<VendorPage/>} />
                        <Route path="/sent-emails" element={<SentEmailsPage/>} />
                    </Routes>
                </div>
            </div>
        </Router>
    );
}

const HomePage = () => (
    <div>
        <h1>Welcome to Employee and Vendor Management</h1>
        <p>Use the navigation links to manage employees, vendors, or view sent emails.</p>
    </div>
);

export default App;
