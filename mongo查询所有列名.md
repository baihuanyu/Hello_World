
mr = db.runCommand({
    "mapreduce": "dts_issue",
    "map": function() {
        for (var key in this) {
            emit(key, null);
        }
    },
    "reduce": function(key, stuff) {
        return null;
    },
    "out": "dts_issue" + "_keys"
})
 
db[mr.result].distinct("_id")
