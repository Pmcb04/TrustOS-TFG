// field true if the date is put in a field date of telefonica mistica
export const convertLocalDateToString = (date, field) => {
  console.log("date", date)
  var d = new Date(date),
    month = '' + (d.getMonth() + 1),
    day = '' + d.getDate(),
    year = d.getFullYear(),
    hours = '' + d.getHours(),
    minutes = '' + d.getMinutes(),
    seconds = '' + d.getSeconds()

  if (month.length < 2) month = '0' + month
  if (day.length < 2) day = '0' + day
  if (hours.length < 2) hours = '0' + hours
  if (minutes.length < 2) minutes = '0' + minutes
  if (seconds.length < 2) seconds = '0' + seconds

  console.log("field" ,field)

  if(field) return [year, month, day].join('-') + 'T' + hours + ':' + minutes
  return [day, month, year].join('/') + ' ' + hours + ':' + minutes + ':' + seconds
}

// Date format YYYY-MM-DDTHH:MM
export const convertLocalDateToTimestamp = (date) => {
  const dateString = date.toString()
  const dateArray = dateString.split('T')
  const dateArray1 = dateArray[0].split('-') // YYYY-MM-DD
  const dateArray2 = dateArray[1].split(':') // HH:MM
  const d = new Date(dateArray1[0], dateArray1[1] - 1, dateArray1[2], dateArray2[0], dateArray2[1])
  return d.getTime() / 1000 // pass to timestamp
}

export const convertTimestampToLocalDate = (timestamp, field) => {
  return convertLocalDateToString(new Date(timestamp * 1000), field)
}
