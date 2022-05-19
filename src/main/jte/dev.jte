@import objects.Dev
@import java.util.*
@param ArrayList<Dev> devs


<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>

<body>

    <a href="/">Home</a>
    <br>
    @for(Dev dev : devs)
      ${dev.getName()}
      <a href="${dev.geturl()}">${dev.geturl()}</a>
      
    @endfor

   
</body>

</html>