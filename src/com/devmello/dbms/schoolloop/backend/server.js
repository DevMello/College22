const express = require('express');
const app = express();
const sql = require("mssql");

app.get('/grades', async function (req, res) {


    try {
        // make sure that any items are correctly URL encoded in the connection string
        await sql.connect('Server=http://cis55.missioncollege.edu/,1433;Database=cis55_35;User Id=cis55_35;Password=sql4u!;Encrypt=false')
        const result = await sql.query`SELECT TOP 501 t.* FROM cis55_35.dbo.takes t WHERE ID=12345`
        console.dir(result)
        res.send(result.recordsets[0]);
    } catch (err) {
        // ... error checks
    }
});

const server = app.listen(5000, function () {
    console.log('Server is running..');
    sql.connect('Server=209.129.147.39,1433;Database=cis55_35;User Id=cis55_35;Password=sql4u!;Encrypt=false').then(r => console.log(r))
});

