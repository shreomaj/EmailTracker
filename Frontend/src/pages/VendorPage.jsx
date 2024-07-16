// src/pages/VendorPage.js
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function VendorPage() {
    const [vendors, setVendors] = useState([]);
    const [vendor, setVendor] = useState({ name: '', upi: '', email: '' });
    const [vendorEmails, setVendorEmails] = useState([]);

    useEffect(() => {
        fetchVendors();
    }, []);

    const fetchVendors = async () => {
        const response = await axios.get('/vendors');
        setVendors(response.data);
    };

    const handleChange = (e) => {
        const { name, value } = e.target;
        setVendor(prevState => ({ ...prevState, [name]: value }));
    };

    const addVendor = async () => {
        await axios.post('/vendors', vendor);
        fetchVendors();
        setVendor({ name: '', upi: '', email: '' });
    };

    const sendEmails = async () => {
        await axios.post('/vendors/sendEmails', vendorEmails);
        alert('Emails sent');
    };

    return (
        <div>
            <h2>Vendors</h2>
            <form onSubmit={(e) => { e.preventDefault(); addVendor(); }}>
                <input type="text" name="name" value={vendor.name} onChange={handleChange} placeholder="Name" required />
                <input type="text" name="upi" value={vendor.upi} onChange={handleChange} placeholder="UPI" required />
                <input type="email" name="email" value={vendor.email} onChange={handleChange} placeholder="Email" required />
                <button type="submit">Add Vendor</button>
            </form>
            <ul>
                {vendors.map(v => (
                    <li key={v.email}>
                        <input type="checkbox" value={v.email} onChange={(e) => {
                            if (e.target.checked) {
                                setVendorEmails(prev => [...prev, v.email]);
                            } else {
                                setVendorEmails(prev => prev.filter(email => email !== v.email));
                            }
                        }} />
                        {v.name} - {v.upi} - {v.email}
                    </li>
                ))}
            </ul>
            <button onClick={sendEmails}>Send Emails</button>
        </div>
    );
}

export default VendorPage;
