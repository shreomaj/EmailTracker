// src/pages/SentEmailsPage.js
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function SentEmailsPage() {
    const [sentEmails, setSentEmails] = useState([]);

    useEffect(() => {
        fetchSentEmails();
    }, []);

    const fetchSentEmails = async () => {
        const response = await axios.get('/vendors/sentEmails');
        setSentEmails(response.data);
    };

    return (
        <div>
            <h2>Sent Emails</h2>
            <ul>
                {sentEmails.map((email, index) => (
                    <li key={index}>{email}</li>
                ))}
            </ul>
        </div>
    );
}

export default SentEmailsPage;
