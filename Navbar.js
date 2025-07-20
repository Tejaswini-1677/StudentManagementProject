import React from 'react';
import { Link } from 'react-router-dom';

function Navbar() {
  return (
    <nav style={{ padding: '10px', background: '#eee' }}>
      <Link to="/" style={{ margin: '0 10px' }}>Home</Link>
      <Link to="/students" style={{ margin: '0 10px' }}>Students</Link>
      <Link to="/add-student" style={{ margin: '0 10px' }}>Add Student</Link>
      <Link to="/courses" style={{ margin: '0 10px' }}>Courses</Link>
      <Link to="/add-course" style={{ margin: '0 10px' }}>Add Course</Link>
    </nav>
  );
}

export default Navbar;
