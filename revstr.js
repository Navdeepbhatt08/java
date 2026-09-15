function rev(S)
{
let revs="";
   
    for(let i =S.length-1;i>=0;i--)
    {
        revs +=S[i]; 
    }

    return revs;
}

console.log(rev("Rahul"))