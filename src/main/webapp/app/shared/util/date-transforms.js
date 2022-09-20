export const convertLocalDateToString = (date) => {
  return !date || !date.getYear
    ? ''
    : ('0' + (date.getMonth() + 1).toString()).substr(-2) +
        '/' +
        ('0' + date.getDate().toString()).substr(-2) +
        '/' +
        date.getFullYear().toString().substr(2)
}

export const convertDateTimeFromServer = (date) => {
  if (date) {
    return new Date(date)
  } else {
    return null
  }
}

export const convertLocalDateFromServer = (date) => {
  if (date) {
    var dateString = date.split('-')
    return new Date(dateString[0], dateString[1] - 1, dateString[2])
  }
  return null
}

export const convertTimestampToLocalDate = (timestamp) => {
  var t = new Date(timestamp * 1000)

  var formatted =
    t.toString().split(' ')[0] +
    ', ' +
    ('0' + t.getDate()).slice(-2) +
    '/' +
    ('0' + (t.getMonth() + 1)).slice(-2) +
    '/' +
    t.getFullYear() +
    ' - ' +
    ('0' + t.getHours()).slice(-2) +
    ':' +
    ('0' + t.getMinutes()).slice(-2) +
    ':' +
    ('0' + t.getSeconds()).slice(-2)

  return formatted
}
