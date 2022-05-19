@import objects.mitreTactic
@import java.util.*
@param ArrayList<mitreTactic> tactics


<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>

<body>

    <a href="/">Home</a>
    <br>
    <br>
    You have ${tactics.size()} tactic(s) documented. 

    @if(tactics.size()>=14)
      You've got them all - well done!
    @else
      Still some to document - keep going!
    @endif
   

    @for(mitreTactic tactic : tactics)
      <details>
        <summary>${tactic.getName()}</summary>
          <li>ID: ${tactic.getid()}</li>
          <li>${tactic.getDescription()}</li>
      </details>
    @endfor

   
</body>

</html>