document.getElementById('collectionForm').addEventListener('submit', function(event) {
    event.preventDefault();
  
    const farmerName = document.getElementById('farmerName').value;
    const quantity = document.getElementById('quantity').value;
    const quality = document.getElementById('quality').value;
    const containerIds = document.getElementById('containerIds').value;
  
    const pastCollections = document.getElementById('pastCollections');
    pastCollections.innerHTML += `
      <p>Farmer: ${farmerName}, Quantity: ${quantity}L, Quality: ${quality}, Containers: ${containerIds}</p>
    `;
  });
  