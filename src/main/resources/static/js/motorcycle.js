$('document').ready(function () {
    $('table #editButton').on('click', function (event) {
        event.preventDefault();

        // /location/findById/?id=1
        var href =$(this).attr('href');
        $.get(href,function (motorcycle, status) {
            $('#idEdit').val(motorcycle.motorcycleId);
            $('#brandEdit').val(motorcycle.name);
            $('#modelEdit').val(motorcycle.model);
            $('#typeEdit').val(motorcycle.type);
            $('#amountEdit').val(motorcycle.amount);
            $('#motorcycleStatusEdit').val(motorcycle.motorcycleStatus);
        });

        $('#editModal').modal();
    });

    $('table #deleteButton').on('click',function (event) {
        event.preventDefault();
        var href=$(this).attr('href'); // asignat la butonul YES!

        $('#confirmDeleteButton').attr('href',href);

        $('#deleteModal').modal();

    })

});