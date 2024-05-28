async function apiGet(path){
    let headerData = {
        method:'GET',
        headers: {
            'Content-Type':'application/json'
        }
    }

    var response =await fetch(path,headerData);
    const isJson = response.headers.get('content-type')?.includes('application/json');
    const data = isJson ? await response.json() : null;
    return data;
}
async function apiPost(path,postBody){
    let headerData = {
        method:'POST',
        headers: {
            'Content-Type':'application/json'
        },
        body:JSON.stringify(postBody)
    }

    var response =await fetch(path,headerData);
    const isJson = response.headers.get('content-type')?.includes('application/json');
    const data = isJson ? await response.json() : null;
    return data;

}
export const saveDepartment = async (header) => {
    return await apiPost('http://localhost:8080/department',header)
}

export const fetchDepartment = async () => {
    return await apiGet('http://localhost:8080/department');
}
export const fetchDepartmentByStatus = async (status) => {
    return await apiGet('http://localhost:8080/department/status/'+status);
}
export const deleteDepartment = async (header) => {
    return await apiPost('http://localhost:8080/department/delete',header)
}
export const saveSubDepartment = async (header) => {
    return await apiPost('http://localhost:8080/subdepartment',header)
}
export const fetchSubDepartment = async () => {
    return await apiGet('http://localhost:8080/subdepartment');
}
export const fetchSubDepartmentByDepartmentKey = async (departmentKey) => {
    return await apiGet('http://localhost:8080/subdepartment/department/'+departmentKey);
}
export const saveTrainingDetail = async (header) => {
    return await apiPost('http://localhost:8080/trainingdetail',header)
}
export const fetchTrainingDetails = async () => {
    return await apiGet('http://localhost:8080/trainingdetail')
}
export const fetchTrainingRegisteredEmployee = async (key) => {
    return await apiGet('http://localhost:8080/trainingdetail/'+key+'/employee')
}
export const fetchTrainingDetailByKey = async (key) => {
    return await apiGet('http://localhost:8080/trainingdetail/'+key)
}
export const fetchAllEmployee = async () => {
    return await apiGet('http://localhost:8080/employee')
}
export const saveEmployee = async (header) => {
    return await apiPost('http://localhost:8080/employee',header)
}
export const saveTrainingMapperEmployee = async (header) => {
    return await apiPost('http://localhost:8080/trainingmapper',header)
}
export const fetchCompany = async () => {
    return await apiGet('http://localhost:8080/company')
}
export const fetchCompanyById = async (id) => {
    return await apiGet('http://localhost:8080/company/'+id)
}
export const fetchCompanyByStatus = async (status) => {
    return await apiGet('http://localhost:8080/company/status/'+status)
}
export const saveCompany = async (header) => {
    return await apiPost('http://localhost:8080/company',header)
}
export const deleteCompany = async (header) => {
    return await apiPost('http://localhost:8080/company/delete',header)
}