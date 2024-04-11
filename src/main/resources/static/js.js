function regMotorvogn() {
    let personnr=$("#personnr").val();
    let navn=$("#eiersNavn").val();
    let adresse=$("#adresse").val();
    let kjennetegn=$("#kjennetegn").val();
    let bilmerke=$("#biltype").val();
    let biltype=$("#biltype").val();

    const liste={
        eierPersonNr:eierPersonNr,
        eiersNavn:eiersNavn,
        eiersAdresse:eiersAdresse,
        kjennetegn:kjennetegn,
        bilmerke : bilmerke,
        biltype : biltype
    }
    $.post("/add",liste,function(){

    })

    let alleMotorvogn=$.get("/hentalle",function (){

    })
    for (let  eier of alleMotorvogn) {

    }

    console.log(alleMotorvogn)
}
