const fs = require('fs');

// Specify the path to your JSON file
const filePath = '/path/to/your/json/file.json';

// Read the JSON file
fs.readFile(filePath, 'utf8', (err, data) => {
  if (err) {
    console.error('Error reading JSON file:', err);
    return;
  }

  try {
    // Parse the JSON data
    const jsonData = JSON.parse(data);

    // Print the data to the console
    console.log(jsonData);
  } catch (error) {
    console.error('Error parsing JSON data:', error);
  }
});
