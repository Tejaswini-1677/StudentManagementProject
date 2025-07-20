import React, { useState } from 'react';

function AddCourse() {
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();

    const course = { title, description };

    try {
      const response = await fetch('http://localhost:8082/courses', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(course)
      });

      if (!response.ok) {
        throw new Error('Failed to add course');
      }

      const data = await response.json();
      alert(`Course "${data.name}" added successfully!`);
      setTitle('');
      setDescription('');
    } catch (error) {
      console.error('Error:', error);
      alert('Failed to add course');
    }
  };

  return (
    <div>
      <h2>Add Course</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Course Name:</label><br />
          <input
            type="text"
            value={name}
            onChange={(e) => setName(e.target.value)}
            required
          />
        </div>
        <div>
          <label>Description:</label><br />
          <textarea
            value={description}
            onChange={(e) => setDescription(e.target.value)}
            required
          ></textarea>
        </div>
        <button type="submit">Add Course</button>
      </form>
    </div>
  );
}

export default AddCourse;
